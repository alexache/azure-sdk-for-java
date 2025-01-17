// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Text analysis result.
 */
@Immutable
public final class TextCategoriesAnalysis {

    /*
     * The text analysis category.
     */
    @Generated
    @JsonProperty(value = "category")
    private TextCategory category;

    /*
     * The value increases with the severity of the input content. The value of this field is determined by the output
     * type specified in the request. The output type could be ‘FourSeverityLevels’ or ‘EightSeverity Levels’, and the
     * output value can be 0, 2, 4, 6 or 0, 1, 2, 3, 4, 5, 6, or 7.
     */
    @Generated
    @JsonProperty(value = "severity")
    private Integer severity;

    /**
     * Creates an instance of TextCategoriesAnalysis class.
     *
     * @param category the category value to set.
     */
    @Generated
    @JsonCreator
    private TextCategoriesAnalysis(@JsonProperty(value = "category") TextCategory category) {
        this.category = category;
    }

    /**
     * Get the category property: The text analysis category.
     *
     * @return the category value.
     */
    @Generated
    public TextCategory getCategory() {
        return this.category;
    }

    /**
     * Get the severity property: The value increases with the severity of the input content. The value of this field
     * is determined by the output type specified in the request. The output type could be ‘FourSeverityLevels’ or
     * ‘EightSeverity Levels’, and the output value can be 0, 2, 4, 6 or 0, 1, 2, 3, 4, 5, 6, or 7.
     *
     * @return the severity value.
     */
    @Generated
    public Integer getSeverity() {
        return this.severity;
    }
}
