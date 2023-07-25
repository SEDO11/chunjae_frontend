package sec3;

// 성능 측정
public class SystemEx3 {
    public static void main(String[] args) {
        // 성능 평가 기준 ***(중요)
        // 처리능력(Throughput) | 높아야 좋음, 반환시간(Turn Arround) | 낮아야 좋음,
        // 사용 가능도(Availability) | 높아야 좋음, 신뢰도(Reliability) | 높아야 좋음
        long tot = 0;
        long start = System.nanoTime(); //10**-9 초
        for(int i=0; i<=1000000; i++) {
            System.out.println(i);
            tot+=i;
        }
        long end = System.nanoTime();
        System.out.println("누적 합 : "+tot);
        System.out.println("걸린 시간 : "+(end-start)+"ns");
    }
}
