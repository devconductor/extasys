/*Copyright (c) 2008 Nikos Siatras

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/
package extasys.Examples.TCPChatServer;

import extasys.Network.TCP.Server.Listener.Exceptions.*;
import extasys.Network.TCP.Server.Listener.TCPClientConnection;

/**
 *
 * @author Nikos Siatras
 */
public class TCPChatUser
{

    private String fUsername;
    private TCPClientConnection fConnection;

    public TCPChatUser(String username, TCPClientConnection connection)
    {
        fUsername = username;
        fConnection = connection;
    }

    public String getUsername()
    {
        return fUsername;
    }

    public TCPClientConnection getConnection()
    {
        return fConnection;
    }

    public void SendData(String data) throws ClientIsDisconnectedException, OutgoingPacketFailedException
    {
        fConnection.SendData(data);
    }
}
