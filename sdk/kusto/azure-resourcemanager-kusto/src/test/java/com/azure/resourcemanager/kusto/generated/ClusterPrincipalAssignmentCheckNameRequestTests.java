// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalAssignmentCheckNameRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterPrincipalAssignmentCheckNameRequestTests {
    @Test
    public void testDeserialize() {
        ClusterPrincipalAssignmentCheckNameRequest model =
            BinaryData.fromString("{\"name\":\"dejbavo\"}").toObject(ClusterPrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("dejbavo", model.name());
    }

    @Test
    public void testSerialize() {
        ClusterPrincipalAssignmentCheckNameRequest model =
            new ClusterPrincipalAssignmentCheckNameRequest().withName("dejbavo");
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("dejbavo", model.name());
    }
}