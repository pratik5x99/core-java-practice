package oop.mastery.memory.question3;

public class TerrainGenerator {
    public int[][] generateTerrain(){
        int[][] terrain = new int[5][];
        for(int i=0;i<5;i++){
            int num = (int)(Math.random()*5)+3;

            terrain[i] = new int[num];
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<terrain[i].length;j++){
                terrain[i][j]=(int)(Math.random()*10);
            }
        }
        return terrain;
    }
}
