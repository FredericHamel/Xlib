#!/usr/bin/env gsc-script -i package.sc
(##require-module _build)
(##require-module define-library)

(build#setup)
(build#link
  (build#make-project!
    (this-source-file)
    (build#add-sources preload: #f "Xlib.sld"))
  link-options: "-lX11")


