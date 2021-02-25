/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.litho.widget;

import androidx.annotation.Nullable;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.rendercore.Function;

@LayoutSpec
public class ItemCardComponentSpec {

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c, @Prop int id, @Prop Component body) {
    return Column.create(c)
        .child(CardHeaderComponent.create(c).title("Some title #" + id))
        .child(CardBodyComponent.create(c).content(body))
        .build();
  }

  public static class TreeProps {
    public @Nullable Function<Void> onCardActionsTouched;
    public @Nullable Function<Void> onCardActionViewVisible;
    public boolean areCardToolsDisabled;
  }
}
