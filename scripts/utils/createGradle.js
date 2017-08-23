// @remove-file-on-eject
/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
'use strict';

const spawn = require('react-dev-utils/crossSpawn');


module.exports = () => {
  const cmd = './gradlew';
  const args = ['-t', 'build'];

  return {
    start: () => spawn(cmd, args, { stdio: 'inherit' }),
  };
};
