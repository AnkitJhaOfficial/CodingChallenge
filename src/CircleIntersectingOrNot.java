import java.util.Arrays;

public class CircleIntersectingOrNot {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 4;
        int r1 = 5;
        int x2 = 14;
        int y2 = 18;
        int r2 = 18;
        int circleInterSectingEachOther = isCircleInterSectingEachOther(x1, y1, r1, x2, y2, r2);
        System.out.println(circleInterSectingEachOther);
        circleInterSectionPoint(x1,y1,r1,x2,y2,r2);

    }

    public static int isCircleInterSectingEachOther(int x1, int y1, int r1, int x2, int y2, int r2) {

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance);
        if (distance == 0 && r1 == r2) {
            System.out.println("Overlapping circles");
        } else if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) {
            double x3 = x1 - (r1 * (x1 - x2)) / distance;
            double y3 = y1 - (r1 * (y1 - y2)) / distance;
            System.out.println("single intersection point (x,y)" + "(" + x3 + "," + y3 + ")");
            return 1;
        } else if (distance < (r1 + r2) && distance > Math.abs(r1 - r2)) {
            return 1;
        }
        else {
            return 0;
        }
        return 0;
    }

    public static int circleInterSectionPoint(int x1, int y1, int r1, int x2, int y2, int r2) {

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance);

        if (distance == 0 && r1 == r2) {
            System.out.println("Overlapping circles");
        }
        else if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) {
            double x3 = x1 - (r1 * (x1 - x2)) / distance;
            double y3 = y1 - (r1 * (y1 - y2)) / distance;
            System.out.println("single intersection point (x,y)" + "(" + x3 + "," + y3 + ")");
            return 1;
        }
        else if (distance < (r1 + r2) && distance > Math.abs(r1 - r2)) {
            // x^2 +y^2+2gx+2fy+c=0
            //c=g^2+f^2-r^2
            double g=-x1;
            double f=-y1;
            double c=(g*g)+(f*f)-(r1*r1);

            double[] eq1 = new double[5];
            eq1[0]=1;
            eq1[1]=1;
            eq1[2]=2*g;
            eq1[3]=2*f;
            eq1[4]=c;

            g=-x2;
            f=-y2;
            c=(g*g)+(f*f)-(r2*r2);

            double[] eq2 = new double[5];
            eq2[0]=1;
            eq2[1]=1;
            eq2[2]=2*g;
            eq2[3]=2*f;
            eq2[4]=c;

            System.out.println("Eq1 "+ Arrays.toString(eq1) +"  Eq2 "+Arrays.toString(eq2) );

            double[] finalEq = new double[5];
            for (int i = 0; i < eq1.length; i++) {
                finalEq[i]=eq2[i]-eq1[i];
            }

            System.out.println("finalEq "+ Arrays.toString(finalEq)  );
            double xe=0;
            double oldxe=0;
            double ye=0;
            for (int i = 0; i < 100; i++) {
                ye=finalEq[4]-xe*finalEq[2];

                if(ye==finalEq[3]){
                    System.out.println("x :"+ xe+" y : "+ye);
                    break;
                }
                else{
//                    xe++;
                    System.out.println("x :"+ xe+" y : "+ye);

                }
                xe--;
            }

            return 1;
        }
        else {
            return 0;
        }
        return 0;
    }
}
