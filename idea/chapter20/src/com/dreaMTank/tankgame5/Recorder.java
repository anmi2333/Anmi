package com.dreaMTank.tankgame5;

import java.io.*;
import java.util.Vector;

/**
 * @ author WANG CHAO
 * @ version 1.0
 * 用于记录相关信息和文件交互
 */
public class Recorder {
    //定义变量记录我方敌人坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象
    //private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "src\\myRecord.txt";
    private static Vector<EnemyTank> enemyTanks = null;
    private static Vector<Node> nodes = new Vector<>();
    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static String getRecordFile() {
        return recordFile;
    }
    public static Vector<Node> getNodesAndEnemyTankRec() {
//增加一个方法 用于读取recorFile 恢复相关信息
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件 生成nodes集合
            String line = "";
            while ((line = br.readLine()) != null){
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]),
                        Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br == null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return nodes;
    }
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {
                    String record = enemyTank.getX() + " " + enemyTank.getY() + enemyTank.getDirect();
                    bw.write(record + "\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addALLEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

}
