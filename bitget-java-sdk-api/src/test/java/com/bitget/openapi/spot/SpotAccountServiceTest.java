package com.bitget.openapi.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.enums.spot.AccountTypeEnum;
import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.request.spot.SpotTransferRecordReq;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;

public class SpotAccountServiceTest extends BaseTest {


    @Test
    public void assets() throws IOException {
        ResponseResult assets = bitgetRestClient.spot().bitget().account().assets();
        System.out.println(JSON.toJSONString(assets));
    }



    @Test
    public void bills() throws IOException {
        SpotBillQueryReq build = SpotBillQueryReq.builder()
//                .coinId(1)
//                .before(777031099461570560L)
                .build();
        ResponseResult assets = bitgetRestClient.spot().bitget().account().bills(build);
        System.out.println(JSON.toJSONString(assets));
    }

    @Test
    public void transferRecords() throws IOException {
        SpotTransferRecordReq build = SpotTransferRecordReq.builder().fromType(AccountTypeEnum.OTC_SGD.getCode()).build();
        ResponseResult assets = bitgetRestClient.spot().bitget().account().transferRecords(build);
        System.out.println(JSON.toJSONString(assets,true));
    }


}
