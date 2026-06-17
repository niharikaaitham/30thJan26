package variableStudy;

public class ParameterVarStudy {
    int x;
    int y;
    static void main(String[] args) {
        ParameterVarStudy parameterVarStudy = new ParameterVarStudy();
        parameterVarStudy.addition();

ParameterVarStudy parameterVarStudy1=new ParameterVarStudy(1,2);
        parameterVarStudy1.addition();
        //constructor name should be same as className
        //user defined constructor with zero parameters
    }
        public ParameterVarStudy() {
            x = 1;
            y = 2;
        }
    //user defined constructor with 2 parameters

        public ParameterVarStudy(int p,int q){
            x=p;
            y=q;
        }

            public void addition(){
            int sum=x+y;
            System.out.println(sum);


        }
    }

