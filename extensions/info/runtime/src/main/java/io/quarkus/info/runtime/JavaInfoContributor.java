package io.quarkus.info.runtime;

import java.util.LinkedHashMap;
import java.util.Map;

import io.quarkus.info.runtime.spi.InfoContributor;
import io.quarkus.runtime.annotations.RecordableConstructor;

public class JavaInfoContributor implements InfoContributor {

    private static final String VERSION = "version";
    private final Map<String, Object> state;

    public static JavaInfoContributor create() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put(VERSION, System.getProperty("java.version"));
        return new JavaInfoContributor(data);
    }

    @RecordableConstructor
    public JavaInfoContributor(Map<String, Object> state) {
        this.state = state;
    }

    @Override
    public String name() {
        return "java";
    }

    @Override
    public Map<String, Object> data() {
        return state;
    }

    public String getVersion() {
        return (String) state.get("version");
    }

    public Map<String, Object> getState() {
        return state;
    }
}
