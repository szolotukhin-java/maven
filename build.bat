@echo off
rem echo ================================================================================================================
rem echo -Pprofile_A
rem echo ================================================================================================================
rem call mvn validate -Pprofile_A

rem echo ================================================================================================================
rem echo -Pprofile_B
rem echo ================================================================================================================
rem call mvn validate -Pprofile_B

rem echo ================================================================================================================
rem echo -Pprofile_A,profile_B
rem echo ================================================================================================================
rem call mvn validate "-Pprofile_A,profile_B"

rem echo ================================================================================================================
rem echo -Pprofile_A -Pprofile_B
rem echo ================================================================================================================
rem call mvn validate -Pprofile_A -Pprofile_B

rem echo ================================================================================================================
rem echo -P profile_A -P profile_B
rem echo ================================================================================================================
rem call mvn validate -P profile_A -P profile_B

rem echo ================================================================================================================
rem echo -P profile_A -P -profile_B
rem echo ================================================================================================================
rem call mvn validate -P profile_A -P -profile_B

rem echo ================================================================================================================
rem echo -P profile_A -P "   profile_B   ,   profile_C   "
rem echo ================================================================================================================
rem call mvn validate -P profile_A -P "   profile_B   ,   profile_C   "

echo ================================================================================================================
echo -P profile_A "-P    profile_B   ,   profile_C"
echo ================================================================================================================
call mvn validate -P profile_A "-P    profile_B   ,   profile_C"