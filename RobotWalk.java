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
        RobotFunction r1 = new RobotFunction();
        int speed = 30; //로봇 속도
        String signal = "빨간색"; //교통신호 색
        r1.RobotWalk(speed, signal);
    }
}


