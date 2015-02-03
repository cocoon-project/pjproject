#PYTHON_SO=_pjsua2.so
#LUA_SO=_pjsua2.so
LUA_SO=lua_pjsua2.so

# #PYTHON_SETUP_FLAGS = --inplace 
# ifeq ($(OS),Windows_NT)
#   PYTHON_SETUP_FLAGS += --compiler=mingw32
#   GCC_EXE=gcc.exe
# else
#   GCC_EXE=
# endif

#USE_THREADS = -threads -DSWIG_NO_EXPORT_ITERATOR_METHODS
SWIG_FLAGS += -w312 $(USE_THREADS)

.PHONY: all install uninstall

#all: $(PYTHON_SO)
#all: pjsua2_wrap.cpp
all: $(LUA_SO)

# $(PYTHON_SO): pjsua2_wrap.cpp setup.py $(GCC_EXE)
# 	python setup.py build $(PYTHON_SETUP_FLAGS)


#$ swig -lua example.i -o example_wrap.c
#$ gcc -I/usr/include/lua -c example_wrap.c -o example_wrap.o
#$ gcc -c example.c -o example.o
#$ gcc -shared -I/usr/include/lua -L/usr/lib/lua example_wrap.o example.o -o example.so

$(LUA_SO): pjsua2_wrap.o
	gcc -shared -I/usr/local/Cellar/lua/5.1.5/include -L/usr/local/Cellar/lua/5.1.5/lib pjsua2_wrap.o  -o $(LUA_SO)




# gcc.exe: cc_mingw.c
# 	gcc -o gcc.exe cc_mingw.c
# 	cp gcc.exe g++.exe



pjsua2_wrap.cpp: ../pjsua2.i ../symbols.i Makefile $(SRCS)
	swig $(SWIG_FLAGS) -lua -o pjsua2_wrap.cpp ../pjsua2.i

# clean distclean realclean:
# 	rm -rf $(PYTHON_SO) pjsua2_wrap.cpp pjsua2_wrap.h pjsua2.py build *.pyc
# 	rm -f gcc.exe g++.exe

# install:
# 	python setup.py install --user

# uninstall:
# 	rm -f $(HOME)/.local/lib/python2.7/site-packages/pjsua2*
# 	rm -f $(HOME)/.local/lib/python2.7/site-packages/_pjsua2*

