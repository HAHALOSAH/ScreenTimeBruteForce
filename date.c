#include <stdlib.h>
#include <unistd.h>

int main() {
	setuid(0);
	system("/Users/micahzhou/date.sh");
	return 0;
}
