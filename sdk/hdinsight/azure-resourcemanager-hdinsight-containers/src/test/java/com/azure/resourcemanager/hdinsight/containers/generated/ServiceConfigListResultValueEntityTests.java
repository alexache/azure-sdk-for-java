// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceConfigListResultValueEntity;
import org.junit.jupiter.api.Assertions;

public final class ServiceConfigListResultValueEntityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceConfigListResultValueEntity model =
            BinaryData
                .fromString("{\"value\":\"slyzrpzbchckqq\",\"description\":\"ioxiysuiizyn\"}")
                .toObject(ServiceConfigListResultValueEntity.class);
        Assertions.assertEquals("slyzrpzbchckqq", model.value());
        Assertions.assertEquals("ioxiysuiizyn", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceConfigListResultValueEntity model =
            new ServiceConfigListResultValueEntity().withValue("slyzrpzbchckqq").withDescription("ioxiysuiizyn");
        model = BinaryData.fromObject(model).toObject(ServiceConfigListResultValueEntity.class);
        Assertions.assertEquals("slyzrpzbchckqq", model.value());
        Assertions.assertEquals("ioxiysuiizyn", model.description());
    }
}
