package org.springframework.data.tarantool.core.mapping;

import org.springframework.data.util.ParsingUtils;

class MappingUtils {

    static String camelCaseToSnakeCase(String string) {
        return ParsingUtils.reconcatenateCamelCase(string, "_");
    }

    private MappingUtils() {
    }
}
