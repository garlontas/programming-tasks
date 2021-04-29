FROM gitpod/workspace-full:latest

# Install custom tools, runtime, etc.
RUN sudo apt-get update \
    # pypy3
    && sudo apt-get install -y pypy3 \
    && sudo rm -rf /var/lib/apt/lists/*
