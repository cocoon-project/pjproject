# build/os-auto.mak.  Generated from os-auto.mak.in by configure.

export OS_CFLAGS   := $(CC_DEF)PJ_AUTOCONF=1 -O2 -DPJ_IS_BIG_ENDIAN=0 -DPJ_IS_LITTLE_ENDIAN=1 -fPIC

export OS_CXXFLAGS := $(CC_DEF)PJ_AUTOCONF=1 -O2 

export OS_LDFLAGS  :=  -lm -lpthread  -framework CoreAudio -framework CoreServices -framework AudioUnit -framework AudioToolbox -framework Foundation -framework AppKit -framework QTKit -framework QuartzCore -framework OpenGL  -L/usr/local/Cellar/ffmpeg/1.2/lib -lavformat -lavcodec -lswscale -lavutil  -lcrypto -lssl

export OS_SOURCES  := 


