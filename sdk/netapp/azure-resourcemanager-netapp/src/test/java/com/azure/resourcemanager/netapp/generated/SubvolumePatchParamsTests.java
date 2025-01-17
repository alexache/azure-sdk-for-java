// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumePatchParams;
import org.junit.jupiter.api.Assertions;

public final class SubvolumePatchParamsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumePatchParams model
            = BinaryData.fromString("{\"size\":8527359607634175876,\"path\":\"fnynszqujizdvoqy\"}")
                .toObject(SubvolumePatchParams.class);
        Assertions.assertEquals(8527359607634175876L, model.size());
        Assertions.assertEquals("fnynszqujizdvoqy", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumePatchParams model
            = new SubvolumePatchParams().withSize(8527359607634175876L).withPath("fnynszqujizdvoqy");
        model = BinaryData.fromObject(model).toObject(SubvolumePatchParams.class);
        Assertions.assertEquals(8527359607634175876L, model.size());
        Assertions.assertEquals("fnynszqujizdvoqy", model.path());
    }
}
