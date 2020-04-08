/**
 * 사양
 * 로봇이 교통신호가 있는 횡단보도에 도착했을 때, 교통신호의 상태에 따라서, 로봇의 보행속도 변화. 
 * 녹색이면, 속도 그대로 / 노란색이면 속도×20% / 빨간색이면 0km/h
 * 
 * 키타야마요시아키_2017190038, 마츠바라케이토_2018315057
 */
public class RobotWalk
{
    public static void main(String[] args){
        int speed = 30; //로봇 속도
        String signal = "빨간색"; //교통신호 색
        RobotWalk(speed, signal);
    }
    public static void RobotWalk(int speed, String signal){
        if ("녹색".equals(signal)){ //교통신호가 녹색이라면 속도 변화 없다
            System.out.println(speed);
        }else if("노란색".equals(signal)){ //교통신호가 노란색이라면 속도×20%
            System.out.println(speed*1.2);
        }else{ //교통신호가 빨간색이라면 속도를 0으로 바꾸다
            speed = 0;
            System.out.println(speed);
        }
    }
}


