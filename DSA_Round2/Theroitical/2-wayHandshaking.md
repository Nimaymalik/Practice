# Purpose:
To establish a reliable communication channel

To synchronize sequence numbers for data transfer

To ensure both parties are ready for communication

Steps in the 3-Way Handshake:
1. SYN (Synchronize) – Step 1:
Client → Server

Client wants to start a connection, so it sends a TCP packet with the SYN flag.

Includes the client’s initial sequence number (ISN).

🔁 "Hello, I want to connect. Here's my sequence number."

2. SYN-ACK (Synchronize + Acknowledge) – Step 2:
Server → Client

Server acknowledges the SYN by sending ACK + SYN.

Acknowledges client's sequence number and sends its own sequence number.

🔁 "Got it. Here's my sequence number too."

3. ACK (Acknowledge) – Step 3:
Client → Server

Client sends an ACK back to the server, confirming receipt of the server's sequence number.

🔁 "Thanks, I’m ready to start communication."