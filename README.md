# ScreenTimeBruteForce
This is probably the most stupid idea I have ever actually ended up programming.

## Building
```
$ javac Main.java
$ javac Bruteforce.java
$ gcc date.c -o date
# chown root date
# chmod u+s date
```
This creates the `date` binary. It's just a setuid wrapper around date.sh because I was too lazy to write it in C.
If you actually end up using this code, please make sure to set date.sh as immutable to avoid silly LPE exploits.

## Running
1. Get OBS Studio and start recording.
2. Open `System Settings` or `System Preferences` and try to drag it into a "full screen" on the left half of the screen.
3. Run `java Main` and watch your computer burn.
