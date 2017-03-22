(ns re-native.vector-icons
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-vector-icons-MaterialIcons (js/require "react-native-vector-icons/MaterialIcons"))
(def react-native-vector-icons-FontAwesome (js/require "react-native-vector-icons/FontAwesome"))
(def react-native-vector-icons-MaterialCommunityIcons (js/require "react-native-vector-icons/MaterialCommunityIcons"))

(def MaterialIcons (aget react-native-vector-icons-MaterialIcons "default"))
(def MaterialCommunityIcons (aget react-native-vector-icons-MaterialCommunityIcons "default"))
(def FontAwesome (aget react-native-vector-icons-FontAwesome "default"))

(assert react-native-vector-icons-MaterialIcons)
(assert react-native-vector-icons-MaterialCommunityIcons)
(assert react-native-vector-icons-FontAwesome)
(assert MaterialIcons)
(assert MaterialCommunityIcons)
(assert FontAwesome)

(def material-icon (r/adapt-react-class MaterialIcons))
(def material-community-icon (r/adapt-react-class MaterialCommunityIcons))
(def font-awesome (r/adapt-react-class FontAwesome))
