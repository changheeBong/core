package hello.core;


import hello.core.member.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfig.class,
        // default 는 ComponentScan 패키지가 시작 위치
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)


public class AutoAppConfig {

    // 자동 빈 보다 수동 빈 등록이 우선권을 가진다.
    // 수동 빈이 자동빈을 오버라이딩 해준다.
//    @Bean(name = "MemberRepository")
//    MemberRepository memberRepository(){
//        return memberRepository();
//    }

}
