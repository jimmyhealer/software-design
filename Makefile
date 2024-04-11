# Makefile

JAVAC = javac
JAVA = java

BIN = ./bin
SRC = ./src

SOURCES = $(shell find $(SRC) -name '*.java')

CLASSES = $(SOURCES:$(SRC)/%.java=$(BIN)/%.class)

all: $(CLASSES)

$(BIN)/%.class: $(SRC)/%.java
	@mkdir -p $(@D)
	$(JAVAC) -d $(@D) -sourcepath $(shell dirname $<) $<

run: run-lazy run-access run-remote run-logging run-caching run-smart

run-lazy:
	@echo "run lazy proxy: \n\n"
	@$(JAVA) -cp $(BIN)/lazy Main
	@echo "\n\n"

run-access:
	@echo "run access proxy: \n\n"
	@$(JAVA) -cp $(BIN)/access Main
	@echo "\n\n"

run-remote:
	@echo "run remote proxy: \n\n"
	@$(JAVA) -cp $(BIN)/remote Main
	@echo "\n\n"

run-logging:
	@echo "run logging proxy: \n\n"
	@$(JAVA) -cp $(BIN)/logging Main
	@echo "\n\n"

run-caching:
	@echo "run caching proxy: \n\n"
	@$(JAVA) -cp $(BIN)/caching Main
	@echo "\n\n"

run-smart:
	@echo "run smart proxy: \n\n"
	@$(JAVA) -cp $(BIN)/smart Main
	@echo "\n\n"

clean:
	@rm -rf $(BIN)

.PHONY: all clean run-lazy run-access run-remote run-logging run-caching run-smart
