
/**
 * クラス RobotFunction の注釈をここに書きます.
 * 
 * author 키타야마요시아키_2017190038, 마츠바라케이토_2018315057
 * @version ()
 */
public class Robot
{
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
