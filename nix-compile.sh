#! /bin/sh

lein do clean, uberjar

${GRAALVM_HOME}/bin/native-image \
  -jar target/constdin-0.0.1-standalone.jar \
  -H:Name=constdin \
  --report-unsupported-elements-at-runtime \
  --initialize-at-build-time \
  --verbose
