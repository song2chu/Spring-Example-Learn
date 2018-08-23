/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import protocol.HttpProtocol;
/**
 *
 * @author safev
 */
public class Application implements HttpProtocol{

    @Override
    public String get(String websiteName) {
        return "Hello "+ websiteName;
    }
    
}
