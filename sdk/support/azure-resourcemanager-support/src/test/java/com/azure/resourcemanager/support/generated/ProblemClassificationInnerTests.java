// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ProblemClassificationInner;
import com.azure.resourcemanager.support.models.SecondaryConsentEnabled;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProblemClassificationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProblemClassificationInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"rokft\",\"name\":\"olniwpwcukjf\",\"type\":\"iawxklry\",\"properties\":{\"displayName\":\"ckbasyypndd\",\"secondaryConsentEnabled\":[{\"description\":\"bacphejko\",\"type\":\"nqgoulzndli\"},{\"description\":\"yqkgfg\",\"type\":\"madgakeqsrxyb\"},{\"description\":\"qedqytbciqfoufl\",\"type\":\"nkzsmodmglou\"}]}}")
                .toObject(ProblemClassificationInner.class);
        Assertions.assertEquals("ckbasyypndd", model.displayName());
        Assertions.assertEquals("bacphejko", model.secondaryConsentEnabled().get(0).description());
        Assertions.assertEquals("nqgoulzndli", model.secondaryConsentEnabled().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProblemClassificationInner model =
            new ProblemClassificationInner()
                .withDisplayName("ckbasyypndd")
                .withSecondaryConsentEnabled(
                    Arrays
                        .asList(
                            new SecondaryConsentEnabled().withDescription("bacphejko").withType("nqgoulzndli"),
                            new SecondaryConsentEnabled().withDescription("yqkgfg").withType("madgakeqsrxyb"),
                            new SecondaryConsentEnabled().withDescription("qedqytbciqfoufl").withType("nkzsmodmglou")));
        model = BinaryData.fromObject(model).toObject(ProblemClassificationInner.class);
        Assertions.assertEquals("ckbasyypndd", model.displayName());
        Assertions.assertEquals("bacphejko", model.secondaryConsentEnabled().get(0).description());
        Assertions.assertEquals("nqgoulzndli", model.secondaryConsentEnabled().get(0).type());
    }
}
