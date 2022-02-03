package inclassex01;


public class InClassEx01 {
    
    public static void main(String[] args) {
        
        //This is a comment made on GitHub's edit feature
        
        int[] temperatures = new int[14];
        for(int i = 0; i < temperatures.length; i++){
            temperatures[i] = (int)(Math.random() * 201) - 100;
        }
        
        for(int temps: temperatures){
            System.out.println(temps);
        }
        
        System.out.println("Average temperature: " + calcAvg(temperatures));
    }
    
    public static double calcAvg(int[] temps){
        double avg = 0;
        
        for(int t: temps){
            if (t > -50 || t < 50) {
                avg += t;
            }   
        } 
        return (double)avg/temps.length;
    }
}
