#!/bin/sh
fly -t ws sp -p yavi \
    -c `dirname $0`/pipeline.yml \
    -l `dirname $0`/credentials.yml
