import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterAll //테스트 종료 후 종료전 1회만 실행함 -> static으로 선언
    static void afterAll(){
        System.out.println("@AfterAll");
    }
    @AfterEach // 테스트 케이스 종료하기 전마다 실행
    public void afterEach(){
        System.out.println("@AfterEach");
    }
}
