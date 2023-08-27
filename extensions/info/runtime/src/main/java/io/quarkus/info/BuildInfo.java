package io.quarkus.info;

import java.time.OffsetDateTime;
import java.util.Map;

public interface BuildInfo {

    String group();

    String artifact();

    String version();

    OffsetDateTime time();

    Map<String, Object> buildTimeInfo();
}
