// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedRecommendationList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IoTSecurityAggregatedRecommendationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecurityAggregatedRecommendationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"recommendationName\":\"sadbz\",\"recommendationDisplayName\":\"vdfznudaodvxzb\",\"description\":\"blylpstdbh\",\"recommendationTypeId\":\"srzdzucerscdn\",\"detectedBy\":\"evfiwjmygt\",\"remediationSteps\":\"slswtm\",\"reportedSeverity\":\"Medium\",\"healthyDevices\":3002295961372287593,\"unhealthyDeviceCount\":3838355662332369134,\"logAnalyticsQuery\":\"semwabnet\"},\"tags\":{\"wubmwmbesldn\":\"szhedplvw\",\"lcxog\":\"wwtppj\",\"qqkdltfzxmhhvhgu\":\"okonzmnsikvmkqz\",\"xtibqdxbxwakbog\":\"eodkwobda\"},\"id\":\"xndlkzgxhu\",\"name\":\"iplbpodxunkbebxm\",\"type\":\"byyntwlrbqt\"},{\"properties\":{\"recommendationName\":\"evseotgqrlltmuwl\",\"recommendationDisplayName\":\"wzizxbmpgcjefuzm\",\"description\":\"pbttdum\",\"recommendationTypeId\":\"p\",\"detectedBy\":\"ebmnzbtbhjpglk\",\"remediationSteps\":\"ohdneuel\",\"reportedSeverity\":\"Informational\",\"healthyDevices\":8674928390516574118,\"unhealthyDeviceCount\":250164414285445387,\"logAnalyticsQuery\":\"fikdowwqu\"},\"tags\":{\"lvithhqzonosgg\":\"zx\",\"ljuti\":\"hcohfwdsjnk\"},\"id\":\"swacffgdkzz\",\"name\":\"wkfvhqcrailvp\",\"type\":\"ppfufl\"},{\"properties\":{\"recommendationName\":\"mh\",\"recommendationDisplayName\":\"xyjrxsagafcnih\",\"description\":\"qapnedgfbcv\",\"recommendationTypeId\":\"vq\",\"detectedBy\":\"keqdcvdrhvoods\",\"remediationSteps\":\"bobzdopcjwvnhd\",\"reportedSeverity\":\"Medium\",\"healthyDevices\":2069944131022748416,\"unhealthyDeviceCount\":6392707975975047926,\"logAnalyticsQuery\":\"lpmutwuoegrpkhj\"},\"tags\":{\"dggkzzlvmbmpa\":\"yqsluic\"},\"id\":\"modfvuefywsbpfvm\",\"name\":\"yhrfouyftaakcpw\",\"type\":\"yzvqt\"}],\"nextLink\":\"ubex\"}")
                .toObject(IoTSecurityAggregatedRecommendationList.class);
        Assertions.assertEquals("szhedplvw", model.value().get(0).tags().get("wubmwmbesldn"));
        Assertions.assertEquals("sadbz", model.value().get(0).recommendationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecurityAggregatedRecommendationList model =
            new IoTSecurityAggregatedRecommendationList()
                .withValue(
                    Arrays
                        .asList(
                            new IoTSecurityAggregatedRecommendationInner()
                                .withTags(
                                    mapOf(
                                        "wubmwmbesldn",
                                        "szhedplvw",
                                        "lcxog",
                                        "wwtppj",
                                        "qqkdltfzxmhhvhgu",
                                        "okonzmnsikvmkqz",
                                        "xtibqdxbxwakbog",
                                        "eodkwobda"))
                                .withRecommendationName("sadbz"),
                            new IoTSecurityAggregatedRecommendationInner()
                                .withTags(mapOf("lvithhqzonosgg", "zx", "ljuti", "hcohfwdsjnk"))
                                .withRecommendationName("evseotgqrlltmuwl"),
                            new IoTSecurityAggregatedRecommendationInner()
                                .withTags(mapOf("dggkzzlvmbmpa", "yqsluic"))
                                .withRecommendationName("mh")));
        model = BinaryData.fromObject(model).toObject(IoTSecurityAggregatedRecommendationList.class);
        Assertions.assertEquals("szhedplvw", model.value().get(0).tags().get("wubmwmbesldn"));
        Assertions.assertEquals("sadbz", model.value().get(0).recommendationName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
