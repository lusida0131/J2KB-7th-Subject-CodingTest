package 임수빈.programers.kakao2022_prob92341;

public class Main {
    public static void main(String[] args){
        int[] fees = {180, 5000, 10, 600};
        String[] records ={"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        Integer[] result = new Solution().solution(fees,records);
        for (int q :
                result) {
            System.out.println(q);
        }
    }
}
