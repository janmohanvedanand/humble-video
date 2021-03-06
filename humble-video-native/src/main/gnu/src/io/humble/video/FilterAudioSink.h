/*******************************************************************************
 * Copyright (c) 2014, Andrew "Art" Clarke.  All rights reserved.
 *   
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
/*
 * FilterAudioSink.h
 *
 *  Created on: Aug 5, 2013
 *      Author: aclarke
 */

#ifndef FILTERAUDIOSINK_H_
#define FILTERAUDIOSINK_H_

#include <io/humble/video/FilterSink.h>
#include <io/humble/video/MediaAudio.h>

namespace io {
namespace humble {
namespace video {

/**
 * A source of MediaAudio objects for a FilterGraph.
 */
class VS_API_HUMBLEVIDEO FilterAudioSink : public io::humble::video::FilterSink
{
public:
  /**
   * @param audio The audio to fill if possible.
   * @return >=0 if a successful audio is fetched, or -1 for EOF.
   */
  virtual int32_t getAudio(MediaAudio* audio);

#ifndef SWIG
  static FilterAudioSink*
  make(FilterGraph* graph, AVFilterContext* ctx);
#endif // ! SWIG

protected:
  FilterAudioSink(FilterGraph* graph, AVFilterContext* ctx);
  virtual
  ~FilterAudioSink();
};

} /* namespace video */
} /* namespace humble */
} /* namespace io */
#endif /* FILTERAUDIOSINK_H_ */
