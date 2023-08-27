package io.quarkus.info.runtime;

import java.util.LinkedHashMap;
import java.util.Map;

import io.quarkus.info.runtime.spi.InfoContributor;
import io.quarkus.runtime.annotations.RecordableConstructor;

public class OsInfoContributor implements InfoContributor {

    private static final String NAME = "name";
    private static final String VERSION = "version";
    private static final String ARCH = "arch";

    private final Map<String, Object> state;

    public static OsInfoContributor create() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put(NAME, System.getProperty("os.name"));
        data.put(VERSION, System.getProperty("os.version"));
        data.put(ARCH, System.getProperty("os.arch"));
        return new OsInfoContributor(data);
    }

    @RecordableConstructor
    public OsInfoContributor(Map<String, Object> state) {
        this.state = state;
    }

    @Override
    public String name() {
        return "os";
    }

    @Override
    public Map<String, Object> data() {
        return state;
    }

    public Map<String, Object> getState() {
        return state;
    }

    public String getName() {
        return getProperty(NAME);
    }

    public String getVersion() {
        return getProperty(VERSION);
    }

    public String getArchitecture() {
        return getProperty(ARCH);
    }

    private String getProperty(String name) {
        return (String) state.get(name);
    }
}
