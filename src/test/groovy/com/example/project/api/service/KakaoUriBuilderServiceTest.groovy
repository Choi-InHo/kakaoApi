//package com.example.project.api.service
//
//import net.minidev.json.JSONUtil
//import org.springframework.boot.test.context.SpringBootTest
//import spock.lang.Specification
//
//import java.nio.charset.Charset
//import java.nio.charset.StandardCharsets
//
//class KakaoUriBuilderServiceTest extends Specification {
//    private KakaoUriBuilderService kakaoUriBuilderService
//
//    def setup() {
//        //인스턴스화
//        kakaoUriBuilderService = new KakaoUriBuilderService();
//    }
//
//    def "builderbyAddressSearch - 한글 파라미터의 경우 정상적으로 인코딩"() {
//        given:
//        String address = "서울 성북구"
//        def charset = StandardCharsets.UTF_8
//
//        when:
//        def uri = kakaoUriBuilderService.buildUriByAddressSearch(address)
//        def decodeResult = URLDecoder.decode(uri.toString(), charset)
//
//        then:
//        decodeResult == "https://dapi.kakao.com/v2/local/search/address.json?query=서울 성북구"
//    }
//}
