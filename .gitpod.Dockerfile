FROM gitpod/workspace-full:latest

# Install custom tools, runtime, etc.
RUN sudo apt-get update \
    # pypy3
    && sudo apt-get install -y pypy3 \
    && sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)" "" --skip-chsh \
    && sudo rm -rf /var/lib/apt/lists/* \
    && bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh"
