(ns nl.k3n.compojure-demo.compojure-demo.models.status
  (:require [schema.core :as s]))

(s/defschema Status
  "The status of this service"
  {:version s/Str
   :status  (s/enum "OK" "WARN" "ERROR")})
