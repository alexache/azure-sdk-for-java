// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLExecutePipelineActivityTypeProperties;

public final class AzureMLExecutePipelineActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLExecutePipelineActivityTypeProperties model = BinaryData.fromString(
            "{\"mlPipelineId\":\"datawybbo\",\"mlPipelineEndpointId\":\"datadxhkdy\",\"version\":\"datakufqzuduqfde\",\"experimentName\":\"dataxtplpg\",\"mlPipelineParameters\":\"datazugkfabvek\",\"dataPathAssignments\":\"datalibszcvceglvzh\",\"mlParentRunId\":\"datavv\",\"continueOnStepFailure\":\"dataadpclazaoytku\"}")
            .toObject(AzureMLExecutePipelineActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLExecutePipelineActivityTypeProperties model
            = new AzureMLExecutePipelineActivityTypeProperties().withMlPipelineId("datawybbo")
                .withMlPipelineEndpointId("datadxhkdy").withVersion("datakufqzuduqfde").withExperimentName("dataxtplpg")
                .withMlPipelineParameters("datazugkfabvek").withDataPathAssignments("datalibszcvceglvzh")
                .withMlParentRunId("datavv").withContinueOnStepFailure("dataadpclazaoytku");
        model = BinaryData.fromObject(model).toObject(AzureMLExecutePipelineActivityTypeProperties.class);
    }
}
