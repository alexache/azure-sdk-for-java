// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ColumnDataTypeHintEnum. */
public final class ColumnDataTypeHintEnum extends ExpandableStringEnum<ColumnDataTypeHintEnum> {
    /** Static value uri for ColumnDataTypeHintEnum. */
    public static final ColumnDataTypeHintEnum URI = fromString("uri");

    /** Static value guid for ColumnDataTypeHintEnum. */
    public static final ColumnDataTypeHintEnum GUID = fromString("guid");

    /** Static value armPath for ColumnDataTypeHintEnum. */
    public static final ColumnDataTypeHintEnum ARM_PATH = fromString("armPath");

    /** Static value ip for ColumnDataTypeHintEnum. */
    public static final ColumnDataTypeHintEnum IP = fromString("ip");

    /**
     * Creates or finds a ColumnDataTypeHintEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ColumnDataTypeHintEnum.
     */
    @JsonCreator
    public static ColumnDataTypeHintEnum fromString(String name) {
        return fromString(name, ColumnDataTypeHintEnum.class);
    }

    /**
     * Gets known ColumnDataTypeHintEnum values.
     *
     * @return known ColumnDataTypeHintEnum values.
     */
    public static Collection<ColumnDataTypeHintEnum> values() {
        return values(ColumnDataTypeHintEnum.class);
    }
}