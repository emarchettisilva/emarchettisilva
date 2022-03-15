/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofchainofresponsability;

/**
 *
 * @author emarchettisilva
 */
public abstract class AbstractLog {
    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;

    protected int level;

    //próximo elemento da cadeia de chamada
    protected AbstractLog nextLog;

    public void setNextLog(AbstractLog nextLog){
      this.nextLog = nextLog;
    }

    public void logMessage(int level, String message){
        if (level == this.level) {
            write(message);
        } else {
            if(nextLog !=null){
               System.out.println("Nivel chamado "+this.level+" Nivel executar = "+level);
               nextLog.logMessage(level, message);
            }
        } 
    }

    abstract protected void write(String message);   
}
