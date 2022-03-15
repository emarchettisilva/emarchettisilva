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
public class GofChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    private static AbstractLog getChainOfLog(){
        AbstractLog errorLog = new ErrorLog(AbstractLog.ERROR);
        AbstractLog fileLog = new FileLog(AbstractLog.DEBUG);
        AbstractLog consoleLog = new ConsoleLog(AbstractLog.INFO);

        errorLog.setNextLog(fileLog);
        fileLog.setNextLog(consoleLog);

        return errorLog;	
    }
    
    public static void main(String[] args) {
        AbstractLog logChain = getChainOfLog();

        logChain.logMessage(AbstractLog.INFO, "Enviando uma mensagem.");
        System.out.println("----------------------------------");
        logChain.logMessage(AbstractLog.DEBUG,"Enviando informação de debug.");
        System.out.println("----------------------------------");
        logChain.logMessage(AbstractLog.ERROR,"Enviando um erro.");
   }
}
