JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	ChatGUI.java \
	Client.java \
	ClientThread.java \
	DrawPane.java \
	EmoteChanger.java \
	Server.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
