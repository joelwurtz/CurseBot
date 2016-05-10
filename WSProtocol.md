## Websockets protocol

(Title = TypeID)

# -2101997347

Used when connected by the client.

Contents:

- CipherAlgorithm (int?) : Unknown. Allways 0.
- CipherStrength (int?) : Unknown. Allways 0.
- ClientVersion (String) : Client version. Value to use: "7.0.30"
- MachineKey (String) : The machineKey generated during the authentication phase.
- PublicKey (?) : Unknown.
- SessionID (String) : The SessionID generated using the Sessions API.
- Status (int?) : The request status?. Default: 1
- UserID (int) : The account ID. Can be found using the Sessions or Logins Api.

# -815187584

This TypeID is answered by the server after a successful -2101997347 one.

Contents:

- EncryptedSessionKey (String?) : Unknown.
- ServerTime (String) : Server time. Exemple: "2016-05-10T13:29:35.87177Z"
- Status (int) : The answer status?!

