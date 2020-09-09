package pages;

public class Rover {
    public static final int N = 1;
    public static final int E = 2;
    public static final int S = 3;
    public static final int W = 4;
    int x = 0;
    int y = 0;
    int facing =N;

    public Rover(){

    }

    public void setPosition(int x, int y, int facing){
        this.x = x;
        this.y=y;
        this.facing=facing;
    }

    public String printPosition(){
        char dir = 'N';
        if(facing ==1){
            dir='N';
        }else if(facing==2){
            dir ='E';
        }else if(facing == 3){
            dir ='S';
        }else if(facing ==4){
            dir='W';
        }
       // System.out.println("The position of rover: "+x +" " +y+" "+dir);
        String position =String.valueOf(x)+" "+String.valueOf(y)+" "+dir;


    return position;
    }

    public void process(String commands){

        for (int idx = 0; idx < commands.length(); idx++) {
            process(commands.charAt(idx));
        }
    }
    public void process(Character command){
        if(command.equals('L')){
            turnLeft();
        }else if(command.equals('R')){
          turnRight();
        }else if(command.equals('M')){
          move();
        }else{
            throw new IllegalArgumentException("Speak in Mars language");
        }
    }

    public void move(){
        if(facing == N){
            this.y++;
        }else if(facing == E){
            this.x++;
        }else if(facing ==S){
            this.y--;
        }else if(facing == W){
            this.x--;
        }
    }
    public void turnLeft(){
        facing =(facing-1)< N?W :facing -1;
    }

    public void turnRight(){
        facing = (facing+1)> W?N: facing +1;
    }




}
