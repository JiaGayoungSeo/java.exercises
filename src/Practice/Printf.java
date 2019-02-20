package Practice;

public class Printf {
    public static void main(String[] args){
        //%b : boolean 출력 지시자
        boolean isTrue = true;
        System.out.printf("isTrue[%b]",isTrue);

        int age = 10;
        String addr = "경기도";

        //'%n'지시자를 사용 안 했을 경우
        System.out.printf("줄바꿈 기능");
        System.out.printf("없음.");

        //'%n'지시자를 사용한 경우
        System.out.printf("줄바꾸기%n");
        System.out.printf("성공!%n");

        System.out.printf("내 나이는 %d살 입니다.%n",age);
        System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.%n",age,addr);

        //자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
        System.out.printf("자리수 미지정 :%d%n",1);
        System.out.printf("자리수 미지정 :%d%n",10);
        System.out.printf("자리수 미지정 :%d%n",100);
        System.out.printf("자리수 미지정 :%d%n",1000);

        //자리수 지정했을 경우  오른쪽으로 정렬된다.(남는 자리수는 공백)
        System.out.printf("4자리수인 정수 출력(오른쪽으로 정렬)%n");
        System.out.printf("자리수 지정 :%4d%n",1);
        System.out.printf("자리수 지정 :%4d%n",10);
        System.out.printf("자리수 지정 :%4d%n",100);
        System.out.printf("자리수 지정 :%4d%n",1000);

        //자리수 지정 후 '-'사용하면 왼쪽으로 정렬된다.
        System.out.printf("자리수 지정('-'사용) :%-4d%n",1);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",10);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",100);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",1000);

        //자리수 지정 후 '0'사용하면 오른쪽으로 정렬된다. (왼쪽 자리수는 0으로 채운다)
        System.out.printf("자리수 지정('0'사용) :%04d%n",1);
        System.out.printf("자리수 지정('0'사용) :%04d%n",10);
        System.out.printf("자리수 지정('0'사용) :%04d%n",100);
        System.out.printf("자리수 지정('0'사용) :%04d%n",1000);

        float f = 1.2345f;

        //소수점 자리수 미지정시
        System.out.printf("소수점 자리수 미지정 : %f%n",f);
        //소수점 자리 지정시
        System.out.printf("소수점 자리수 지정 반올림 : %.2f%n",f);

    }
}
