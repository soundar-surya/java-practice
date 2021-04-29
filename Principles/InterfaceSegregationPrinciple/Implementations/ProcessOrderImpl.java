package InterfaceSegregationPrinciple.Implementations;

import InterfaceSegregationPrinciple.Templates.ProcessOrderTemplate;

public class ProcessOrderImpl implements ProcessOrderTemplate{
    // @Override
    public void ProcessOrder(String modelName){
        System.out.printf("%s order accepted!", modelName);
    }
}
