package oop.mastery.memory.question3;

public class Main {
    public static void main(String[] args) {
        TerrainGenerator tg = new TerrainGenerator();
        int[][] terrain = tg.generateTerrain();
        for(int i=0;i<terrain.length;i++){
            for(int t:terrain[i]){
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}
