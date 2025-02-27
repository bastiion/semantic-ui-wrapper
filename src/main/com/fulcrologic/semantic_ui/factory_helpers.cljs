(ns com.fulcrologic.semantic-ui.factory-helpers
  (:require
    [goog.object :as gobj]
    [com.fulcrologic.fulcro.dom :as dom]))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement class (clj->js props) children)))

(defn wrapped-factory-apply
  "Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop."
  [class]
  (let [factory (dom/wrap-form-element class)]
    (fn [props & children]
      (apply factory (clj->js props) children))))

