(ns status-im.chats-list.styles
  (:require [status-im.components.styles :refer [color-white
                                                 color-light-gray
                                                 color-separator
                                                 color-blue
                                                 text1-color
                                                 text2-color
                                                 text4-color
                                                 new-messages-count-color]]
            [status-im.components.tabs.styles :refer [tabs-height]]
            [status-im.components.toolbar.styles :refer [toolbar-background1
                                                         toolbar-background2]]
            [status-im.utils.platform :as p]))

(defn toolbar [chats-scrolled?]
  (merge {:background-color (if chats-scrolled?
                              toolbar-background1
                              toolbar-background2)}
         (get-in p/platform-specific [:component-styles :toolbar])))

(def gradient-top-bottom-shadow
  ["rgba(24, 52, 76, 0.165)"
   "rgba(24, 52, 76, 0.03)"
   "rgba(24, 52, 76, 0.01)"])

(def chat-separator-wrapper
  {:background-color color-white
   :height           0.5
   :padding-left     74})

(def chat-separator-item
  {:border-bottom-width 0.5
   :border-bottom-color color-separator})

(def chat-container
  {:flex-direction      :row
   :background-color    color-white
   :height              76})

(def chat-icon-container
  {:margin-top  -2
   :margin-left -4
   :padding     16
   :width       48
   :height      48})

(def item-container
  {:flex-direction      :column
   :margin-left         30
   :padding-top         16
   :padding-right       16
   :flex                1})

(def name-view
  {:flex-direction :row})

(def name-text
  {:color      text1-color
   :font-size  16})

(def group-icon
  {:margin-top   8
   :margin-right 6
   :width        14
   :height       9})

(def last-message-text
  {:margin-top   4
   :margin-right 20
   :color        text4-color
   :fontSize     14
   :lineHeight   20})

(def last-message-text-no-messages
  (merge last-message-text
         {:color text4-color}))

(def status-container
  {:flex-direction :row
   :top            18
   :right          16})

(def status-image
  {:marginTop 4
   :width     9
   :height    7})

(def datetime-text
  {:fontSize   14
   :color      text4-color
   :marginLeft 5})

(def new-messages-container
  {:position        :absolute
   :top             45
   :right           23
   :width           22
   :height          22
   :backgroundColor new-messages-count-color
   :borderRadius    50})

(def new-messages-text
  {:top       3
   :left      0
   :fontSize  12
   :color     color-blue
   :textAlign :center})

(def chats-container
  {:flex 1})

(def list-container
  (merge (get-in p/platform-specific [:component-styles :main-tab-list])
         {:background-color color-light-gray}))


(def create-icon
  {:fontSize 20
   :height   22
   :color    color-white})

(def person-stalker-icon
  {:fontSize 20
   :height   22
   :color    color-white})
